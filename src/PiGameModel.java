public class PiGameModel {
    private final String piDecimals = "1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
    private int currentIndex = 0;
    private int bestScore = 0;

    public boolean checkDigit(int digit) {
        if (currentIndex >= piDecimals.length()) return false;
        char expectedChar = piDecimals.charAt(currentIndex);
        if (Character.forDigit(digit, 10) == expectedChar) {
            currentIndex++;
            return true;
        }
        return false;
    }

    public int getExpectedDigit() {
        return Character.getNumericValue(piDecimals.charAt(currentIndex));
    }

    public String getCurrentInput() {
        return piDecimals.substring(0, currentIndex);
    }

    public String getFullSequence() {
        return piDecimals;
    }

    public int getScore() {
        return currentIndex;
    }

    public int getBestScore() {
        return bestScore;
    }

    public void updateBestScore() {
        if (currentIndex > bestScore) {
            bestScore = currentIndex;
        }
    }

    public void reset() {
        currentIndex = 0;
    }
}
