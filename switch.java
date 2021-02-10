/*

Description      :  Use Of Switch Case In Java 
Function Date    :  10 Feb 2021
Function Author  :  Prasad Dangare
Input            :  Int

*/

class Switch
{
    public static void main(String args[])
    {
        int month = 4;
        String season;
        switch(month)
        {
            case 12 :
            case 1  :
            case 2  : season = "winter";
                        break;
            case 3  :
            case 4  :
            case 5  : season = "summer";
                        break;
            case 6  :
            case 7  :
            case 8  : season = "monsoon";
                        break;
            case 9  :
            case 10 :
            case 11 : season = "autumn";
                         break;
            default : season = "wrong option"; 
        }
        System.out.println("The Season's Is "+" "+season);
    }
}