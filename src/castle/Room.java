package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exits=new HashMap<String,Room>();



    public Room(String description) 
    {
        this.description = description;
    }
    public void setExit(String direction,Room room){
        exits.put(direction,room);
    }



    @Override
    public String toString()
    {
        return description;
    }
    public String getExitDesc(){
        StringBuffer ret=new StringBuffer();
        for (String dirction :
                exits.keySet()) {
            ret.append(dirction);
            ret.append(' ');
        }
        return ret.toString();
    }
    public Room getExit(String direction){
        Room ret= exits.get(direction);
        return ret;
    }
}
