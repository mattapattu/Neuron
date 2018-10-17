import java.util.ArrayList;
import java.util.Random;

class Neuron {
  float threshold = -40; 
  static float currVal = -65;   
  
  float activation(float inp) {
    
    float out = 0;
    float act = inp + Neuron.currVal;
    
    // if act is less thsn threshold, there will be no output from neuron
    if(act < threshold) {
      
      out  = 0;   
      Neuron.currVal = act;
    }
    else {
      out = 1;
      Neuron.currVal = -65;
    }
    
    return out;
  }
  
  static void main (String[] args) {
    
    Neuron n = new Neuron();
    
    ArrayList<Integer> input = new ArrayList<Integer>();
    ArrayList<Float> output = new ArrayList<Float>();
    
    Random rand = new Random();
    rand.setSeed(System.currentTimeMillis());
    for (int i=0; i<100; i++)
    {
        Integer r = rand.nextInt() % 256;
        input.add(r);
        float Y=n.activation(r);
        output.add(Y);
        
    }
    //test
    System.out.println(output);
        
  }
}



