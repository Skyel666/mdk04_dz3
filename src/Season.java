public class Season {
    enum season {
        WINTER(-20), SPRING(10), AUTUMN(7), SUMMER(23) {
            public String getDescription() {
                return "Warm season";
            }
        };
        int Temp;
        public String getDescription() {
            return "Cold season";
        }
        //constructor
        season(int temp) {
            this.Temp = temp;
        }
    }
    public static void loveSeason(season time_season){
        switch (time_season) {
            case WINTER -> System.out.println("I love winter!");
            case SPRING -> System.out.println("I love spring!");
            case SUMMER -> System.out.println("I love summer!");
            case AUTUMN -> System.out.println("I love autumn!");
        }
    }
    public season loveSeason = season.SUMMER;
    public void getEnum(){
        for (season seasons : season.values()){
            System.out.println(seasons);
            System.out.println(seasons.Temp);
            System.out.println(seasons.getDescription());
            System.out.print("\n");
        }
    }
}
