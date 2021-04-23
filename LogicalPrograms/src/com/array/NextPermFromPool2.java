package com.array;

public class NextPermFromPool2 {

	
	 // remove prefix 0 of a string. "0005040" returns "5040"
    private String removePrefix0(String str) {
        for (int i = 0; i != str.length(); i++)
            if (str.charAt(i) != '0')
                return str.substring(i, str.length());
        return "0";
    }

    private int[] count(String str) {
        int[] res = new int[10];
        for (int i = 0; i != str.length(); i++) 
        	res[str.charAt(i) - '0']++;
        return res;
    }

    // given digit count, sum up the digits from 0 to 9
    private int sumOfDigit0to9(int[] count) {
        int sum = 0;
        for (int v : count) sum += v;
        return sum;
    }

    // given digit count, sum up the digits from 1 to 9
    private int sumOfDigit1to9(int[] count) {
        int sum = 0;
        for (int i = 1; i != 10; i++) sum += count[i];
        return sum;
    }

    // function to tell if we have any digit in our supply that larger than wanted digit
    private boolean hasLarge(int[] supply, int want) {
        for (int i = want + 1; i != 10; i++)
            if (supply[i] != 0)
                return true;
        return false;
    }

    // find the last position that we can beat the lower
    // aware of the non-zero digits that I must consume
    private int getLastBeat(int[] raw, String lower) {
        int[] supply = raw.clone();
        int last = -1;
        int solid = sumOfDigit1to9(supply);
        for (int i = 0; i != lower.length(); i++) {
            final int want = lower.charAt(i) - '0';

            // if at this time the rest of supplied digit can beat this digit of lower, record it
            if (hasLarge(supply, want))
                last = i;

            final boolean cansame;
            if (want == 0) // if want 0, but I have a lot of non-zero digits, we can't be the same
                cansame = (solid < lower.length() - i && supply[0] != 0);
            else // if not 0, simply find out if we can supply this digit
                cansame = supply[want] != 0;

            // try to be the same
            if (cansame == false)
                break;

            // otherwise, we can greedily be the same
            supply[want]--;
            if (want != 0)
                solid--;
        }
        return last;
    }

    private String getSolidString(int[] supply) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i != 10; i++)
            for (int c = supply[i]; c != 0; c--) sb.append(i);
        return sb.toString();
    }

    public String solve(String digits, String lower) {
        lower = removePrefix0(lower);
        {
            int[] countSupply = count(digits);
            int[] countDemand = count(lower);
            // nonzerosupplytotal > demandtotal
            if (sumOfDigit1to9(countSupply) > sumOfDigit0to9(countDemand)) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i != 10; i++)
                    for (int c = countSupply[i]; c != 0; c--) sb.append(i);
                return sb.toString();
            }
        }

        int[] supply = count(digits);
        final int last = getLastBeat(supply, lower);
        StringBuilder sb = new StringBuilder(digits.length());
        if (last == -1) { // get the least non-zero as the digit, then fill 0
            String solid = getSolidString(supply); // if digits == 5004, would get 45
            sb.append(solid.charAt(0)); // use the first digit
            for (int zeroes = lower.length() - (solid.length() - 1); zeroes != 0;
                 zeroes--) // fill 0
                sb.append(0);
            sb.append(solid.substring(1)); // use the rest digits
        } else {
            // otherwise, we have a position that we can beat lower

            // before that position, we try to maintain the same
            for (int i = 0; i != last; i++) {
                int dig = lower.charAt(i) - '0';
                sb.append(dig);
                supply[dig]--;
            }

            // at that position, find a remaining digit that we can beat the target digit
            for (int i = lower.charAt(last) - '0' + 1; i != 10; i++) {
                if (supply[i] != 0) {
                    sb.append(i);
                    supply[i]--;
                    break;
                }
            }

            // fill 0 if we have to
            for (int c = lower.length() - sb.length() - sumOfDigit1to9(supply); c != 0; c--)
                sb.append(0);

            // put in the rest digits in order
            for (int i = 1; i != 10; i++)
                for (int c = supply[i]; c != 0; c--) sb.append(i);
        }
        return sb.toString();
    }
	
	
	
	
	
	
	public static void main(String[] args) {

		String digits = "852";
		String lower = "100";
		
		NextPermFromPool2 nextPermFromPool2 = new NextPermFromPool2();
		String solve = nextPermFromPool2.solve(digits, lower);
		System.out.println("solve " + solve);
	}

}
