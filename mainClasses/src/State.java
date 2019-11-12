import java.util.HashMap;

public class State {

    private HashMap<String, Double> stateMap;

    public State() {
        this.stateMap=new HashMap<>();
        this.stateMap.put("UT",6.85);
        this.stateMap.put("NV",8.00);
        this.stateMap.put("TX",6.25);
        this.stateMap.put("AL",4.00);
        this.stateMap.put("CA",8.25);
    }


    public HashMap<String, Double> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Double> stateMap) {
        this.stateMap = stateMap;
    }

    public Double getDiscountByState(String state){
        return this.stateMap.get(state);
    }

}
