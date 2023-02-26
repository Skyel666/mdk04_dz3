public class Main {
    public static void main(String[] args){
        Season SeasonYear = new Season();
        Season.loveSeason(Season.season.SUMMER);
        System.out.println("Best season for me: "+ SeasonYear.loveSeason +", its "+SeasonYear.loveSeason.getDescription()+" with avg temp: "+SeasonYear.loveSeason.Temp);
        System.out.println();
        SeasonYear.getEnum();
    }
}