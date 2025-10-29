public class SoilAnalysis {
    private final String farmerId;
    private final String districtName;
    private final double nitrogenLevel;
    private final double phosphorusLevel;
    private final double potassiumLevel;
    private final String cropType;

    // Constructor that initializes all fields
    public SoilAnalysis(String farmerId, String districtName, double nitrogenLevel, double phosphorusLevel, double potassiumLevel, String cropType) {
        this.farmerId = farmerId;
        this.districtName = districtName;
        this.nitrogenLevel = nitrogenLevel;
        this.phosphorusLevel = phosphorusLevel;
        this.potassiumLevel = potassiumLevel;
        this.cropType = cropType;
    }

    // Public Getter methods
    public String getFarmerId() {
        return farmerId;
    }
    public String getDistrictName() {
        return districtName;
    }
    public double getNitrogenLevel() {
        return nitrogenLevel;
    }
    public double getPhosphorusLevel() {
        return phosphorusLevel;
    }
    public double getPotassiumLevel() {
        return potassiumLevel;
    }
    public String getCropType() {
        return cropType;
    }

    //
    /**
     * Checks if all three nutrient levels are between 20 and 100 ppm (inclusive).
     */

    public  boolean isBalanced(){
        return (nitrogenLevel>= 20 && nitrogenLevel <= 100)&&
                (phosphorusLevel>=20 && nitrogenLevel <=100)&&
                (potassiumLevel>=20 && phosphorusLevel <= 100);

    }

    public String calculatedFertilizerNeeded(String nutrientName) throws IllegalArgumentException{
        double level = 0 ;
        // deterimine the level based on name
        switch (nutrientName.toLowerCase()){
            case "nitrogen":
                level= nitrogenLevel;
                break;
            case "phosphorus":
                level= phosphorusLevel;
                break;
            case "potassium":
                level = potassiumLevel;
                break;
            default:
                return "Unknow nutrient";

        }

        if (level <= 0 ){
            throw new IllegalArgumentException("Invalid nutrient reading:"+ nutrientName + "level is"+ level);
        }

        if (level < 20) {
            return "DEFICIENT - High application needed for " + nutrientName;
        } else if (level >= 20 && level <= 100) {
            return "OPTIMAL - Maintenance fertilizer only";
        } else { // level > 100
            // Note: The prompt specifically asks to reduce the *nutrient* application in the excess case,
            // so we use the nutrient name from the parameter.
            return "EXCESS - Reduce " + nutrientName + " application";
        }

    }


}
