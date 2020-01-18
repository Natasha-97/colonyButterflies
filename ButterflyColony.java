package assignment2butterfliescolony;


public class ButterflyColony {
    
     int sizeColony ;
     String colB ;
     String ColonyN;
     String colB2;
     String careTk;
     int daysF;
     int totalB;
     int SickB;
     int daysB;
     int deadB;
     
     public String getColonyName(){
       return ColonyN;
     }
       
     public String getCareTakerN(){
        return careTk;
     }
     
     public int getColonySize(){
         return sizeColony;
     }
     
     public String getFirstColor(){
         return colB;
     }
     
     public String getSecondColor(){
         return colB2;  
     }
     
     public int getNumberOfButf(){
         return sizeColony;
     }
     
     public int getDaysFeed(){
         return daysF;
     }
     
     public int getDaysBreed(){
         return daysB;
     }
     
     public int getDeadB(){
         return deadB;
     }
     
     public int setAddColor( int newCl, int sizeColony){
         
         int Bnum = 0;
         if ( newCl == 1){
             
              Bnum = sizeColony;
              
         }
         else
         if ( newCl == 0){
       
              Bnum = (sizeColony *11) / 10;
       
         }
          return Bnum; 
     }
     
     public int setBreedDays(int daysF,int daysB){
     int sucBreed = 0;
         if( daysF < daysB){
             
             sucBreed = daysF;
          
         }
         else
         if( daysB < daysF){
             
            sucBreed = daysB;
       
         }
          return sucBreed;
    }
     
     public int populationB(int daysF,int daysB,int totalB){
         
         if( daysF < daysB){
             
         totalB= totalB * (int)(Math.pow(2,daysF));
         
         }
         else
         if( daysB < daysF){
             
          totalB= totalB * (int)(Math.pow(2,daysB));
       
         }
        return totalB; 
     }
     
     
     public int setDeadB(int SickB, int totalB){
         
         if (SickB == 1){
            
             deadB = totalB * 1 /10;
            
        }else{
             
             deadB = 0;
         }
         
         return deadB;
     }
     
    
}
