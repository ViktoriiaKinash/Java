import java.util.*;
  public class Rnd{
    int Size;
    int Razy;
    double []LiczbyOrigin;

    Rnd(int IleLiczb, int IleRazy){
      Size = IleLiczb;
      Razy= IleRazy;
      LiczbyOrigin = new double [Size];
      Random rd = new Random();
      for(int i=0; i<Size; i++){
        LiczbyOrigin[i]=0.0;
        for(int k=0; k<Razy; k++){
        LiczbyOrigin[i]+=rd.nextDouble();
        }
      }
    }

 

    public void Print(){
      for(int i=0; i<Size; i++){
      System.out.println("["+i+"] = " + LiczbyOrigin[i]);
    }
    }

    public void Draw(){
      int height = 700;
      int width = 20;
      double Min = Min();
      double All = Max() - Min();
    }

    public double Min(){
      double Min = LiczbyOrigin[0];
      for(int i=0; i<Size; i++){
      if(Min>LiczbyOrigin[i]){
        Min = LiczbyOrigin[i];
      }
    }
    return Min;
    }

    public double Max(){
      double Max = LiczbyOrigin[0];
      for(int i=0; i<Size; i++){
      if(Max<LiczbyOrigin[i]){
        Max = LiczbyOrigin[i];
      }
    }
    return Max;
    }

    public double Average(){
      double Sum = 0.0;
      for(int i=0; i<Size; i++){
        Sum += LiczbyOrigin[i];
    }
    return Sum/Size;
    }
    
}