class FSA{
    private int state;

    //constructors

    FSA(int input){
        if(input >= 0 && input <= 3){
            state = input;
        }
        else{
            System.out.println("This is an invalid state. Starting state at 0.");
            new FSA();
        }
    }
    FSA(){
        state = 0;
    }
    //getters
    int getState(){
        return state;
    }

    //methods
    int goToNextState(){
        if (state < 3){
            state++;
        }
        else{
            state = 0;
        }
        return state;
    }
    boolean end(){
        return state == 3;
    }
}
