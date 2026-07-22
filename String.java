class Solution {

    public String convertDateToBinary(String date) {

        String[] d = date.split("-");

        int year = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);

        return Integer.toBinaryString(year) + "-" +
               Integer.toBinaryString(month) + "-" +
               Integer.toBinaryString(day);
    }
}