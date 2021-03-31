/*
 * @Author: your name
 * @Date: 2021-03-31 21:06:16
 * @LastEditTime: 2021-03-31 21:10:28
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Video-Live\Trainer.java
 */
public class Trainer {
    private String trainerName;
    private String trainerType;

    public Trainer(String trainerName, String trainerType){
        setTrainerName(trainerName);
        setTrainerType(trainerType);
    }

    public String getTrainerName(){
        return trainerName;
    }

    public String getTrainerType(){
        return trainerType;
    }

    public void setTrainerName(String trainerName){
        this.trainerName = trainerName;
    }

    public void setTrainerType(String trainerType){
        this.trainerType = trainerType;
    }
    
}