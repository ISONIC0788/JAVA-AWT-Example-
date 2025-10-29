public class FertilizerAdvisorySystem {
    public static void  processSamples(SoilAnalysis[] samples){
        int balancedCount = 0 ;
        int deficientCount = 0 ;
     for (SoilAnalysis sample : samples){
         try {
             System.out.println("\nFarmer ID"+ sample.getFarmerId());
             System.out.println("DISTRICT"+ sample.getDistrictName());
             System.out.println("Crop Type "+ sample.getCropType());

             System.out.println(sample.calculateFertilizerNeeded("Nitrogen"));
             System.out.println(sample.calculateFertilizerNeeded("Phosphorus"));
             System.out.println(sample.calculateFertilizerNeeded("Potassium"));

             if (sample.isBalanced()) balancedCount++;
             else deficientCount ++;

         }catch (IllegalArgumentException e){
             System.out.println("Error processing sample for farmer "+ sample.getFarmerId());
         }
     }
        System.out.println("\n summary reposrt--");
     System.out.println("Balance sample "+ balancedCount);
        System.out.println("Deficint sample"+ deficientCount);



    }
    public static void main(String[] args) {
        SoilAnalysis[] samples = {
                new SoilAnalysis("F002", "Bugesera", 10, 40, 80, "Rice"),     // deficient
                new SoilAnalysis("F003", "Nyagatare", -5, 40, 60, "Beans"),   // invalid (negative)
                new SoilAnalysis("F004", "Huye", 110, 120, 90, "Maize"),      // excess
                new SoilAnalysis("F005", "Gicumbi", 25, 18, 70, "Rice")
        };
        FertilizerAdvisorySystem system = new FertilizerAdvisorySystem();
        system.processSamples(samples);

    }
}
