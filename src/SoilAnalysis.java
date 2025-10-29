import java.util.SplittableRandom;

class  SoilAnalysis{
    private String farmerId;
    private String districtName;
    private double nitrogenLevel;
    private double phosphorusLevel;
    private double potassiumLevel;
    private String cropType;

    public  SoilAnalysis(String farmerId, String districtName, double nitrogenLevel,
                         double phosphorusLevel, double potassiumLevel, String cropType){
        this.farmerId = farmerId;
        this.districtName = districtName;
        this.nitrogenLevel = nitrogenLevel;
        this.phosphorusLevel = phosphorusLevel;
        this.potassiumLevel = potassiumLevel;
        this.cropType = cropType;
    }

    public String getFarmerId(){
        return farmerId;
    }
    public String getDistrictName(){
        return districtName;
    }

    public double getNitrogenLevel(){
        return nitrogenLevel;
    }

    public  double getPhosphorusLevel(){
        return phosphorusLevel;
    }
    public  double getPotassiumLevel(){
        return potassiumLevel;
    }
    public String getCropType(){
        return cropType;
    }
    public boolean isBalanced(){
        return (nitrogenLevel>=20 && nitrogenLevel<=100)&&
                (phosphorusLevel>=20 && phosphorusLevel<=100)&&
                (potassiumLevel>=20 && potassiumLevel<= 100);
    }

    public String calculateFertilizerNeeded(String nutrientName){
        double level = 0;
        if(nutrientName.equalsIgnoreCase("Nitrogen")) level = nitrogenLevel;
        else if (nutrientName.equalsIgnoreCase("Phosporus")) level = phosphorusLevel;
        else if (nutrientName.equalsIgnoreCase("Potassium")) level = potassiumLevel;

        if (level<=0)
            throw  new IllegalArgumentException("Invalid nutirient reading");

        if(level<20)
            return "DEFICIENT"+ nutrientName;
        else if(level <= 100)
            return "OPTIMAL";
        else
            return "EXCESS"+nutrientName+"application";
    }
}