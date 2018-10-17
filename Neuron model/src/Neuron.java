import java.util.ArrayList;
import java.util.Random;

class Neuron {
  float threshold = 2; 
  static float currVal = 0;   
  
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
      Neuron.currVal = 0;
    }
    
//    System.out.println("out is:"+out );
    return out;
  }
  
  public static void main (String[] args) {
    
    Neuron n = new Neuron();
    
    ArrayList<Float> input = new ArrayList<Float>();
    ArrayList<Float> output = new ArrayList<Float>();
    
    Random rand = new Random();
    rand.setSeed(System.currentTimeMillis());
    for (int i=0; i<100; i++)
    {
    	float r;
    	float x = (float) Math.random();
//    	System.out.println("x is:"+x );
    	if(x < 0.5) {
    		r=(float)0.0;
    		input.add(r);
    		
    		
    	} else {
    		r=(float) 1.0;
    		input.add(r);
    		
    	}
//    	System.out.println("r is:"+r );
    	float Y = n.activation(r);
    	output.add(Y);
    	
    }
    
    System.out.println(input);
    System.out.println(output);
        
  }
}



