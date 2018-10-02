public class Complexity{

    int nPower;
    int logPower;

    public Complexity(){
	nPower = 0;
	logPower = 0;
    }

    public Complexity(int newN, int newLog){
	nPower = newN;
	logPower = newLog;
    }

    public int getNPower(){
	return nPower;
    }

    public int setNPower(int newN){
	int oldNPower = nPower;
	nPower = newN;
	return oldNPower;
    }

    public int getLogPower(){
	return logPower;
    }

    public int setLogPower(int newLog){
	int oldLogPower = logPower;
	logPower = newLog;
	return oldLogPower;
    }

    public String toString(){
	String output = "";
	output +=  "O(n^" + nPower + " * log(n)^" + logPower + ")";
	System.out.println(output);
    }
}
