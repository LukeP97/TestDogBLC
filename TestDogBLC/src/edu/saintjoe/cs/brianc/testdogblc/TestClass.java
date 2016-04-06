
//Exam two dog project
public class TestDogBark {
//this shows a code shows how dogs weight effects his bark  and changes it depending on what it is
	//This will show a Dogs name that can be entered for a value 
	    private String name = Mike;
	    //this is where his weight will be entered
	    private int weight = 70;
	    	    //It will take the name that we made and set it to a dog here
	    public void setName(String newName) {
	    	name = newName;
	    }
	    //here is to show the weight that is already an int to be given to this specific dog
	    public void setWeight(int newWeight) {
	    	weight = newWeight;
	    }
	    
//these return values from the caller
	    public String getName() {
	    	return name = Mike;
	    }
	    
	    public int getWeight() {
	    	return weight = 70;
	    }
	    
	    public void bark() {
	    
	    	int pointless = 0;
	    	
	    	//We see how the dogs weight will effect his bark making his weight over 60 it will be Woof!!
	    	//if his weight is over 14 he barks Ruff!! anything lower then that and he says Yip!!
	    	if (weight > 60 ) {
	          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
	    	} else if (weight > 14 ) {
	    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
	    	} else
	    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
	    }
	    
	    public int setBoth(String newName, int newWeight) {
	    	//These are local variables
	    	int oldWeight = weight;
	    	
	    	name = newName;
	    	weight = newWeight;
	    	return oldWeight;
	    }
	    	

	    public void eat() { }
	    
	    public void chaseCat() { }
	    // my new dog to show other dogs to show different effects of their weight 
	    TestDogBark Dog1 = new TestDogBark(Bob, 50);
	    
	    	return value Dog1
	    			Bark()
	    			
	    TestDogBark Dog2 = new TestDogBark(kevin, 10)
	    
	 return value Dog2
			 Bark()
		 
	}


