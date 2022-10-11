package CollectionsInterface;

import java.util.Vector;

class TestPair{
    long long i;
    long long j;
    TestPair(long long i, long long j){
        this.i = i;
        this.j = j;
    }
}

public class ListDemo {
    public int parentOf(int parent){
        if(parent==1) return -1;
        if(parent==2) return 1;
        long long n = parent;
        Vector<TestPair> v = new Vector<>();
        TestPair t1 = new TestPair(1,1);
        TestPair t2 = new TestPair(2, 2);

        v.add(t1);
        v.add(t2);
        long long left, right;
        while(v.lastElement().j < n){
            left = v.lastElement().i;
            right = v.lastElement().j;
            
            TestPair t = new TestPair(right + 1, right + right*(right+1)/2 - (left-1)*(left)/2);
            v.add(t); 
        }

        TestPair parent = (TestPair) v.get(v.size()-2);
        long long first = v.lastElement().i;
        long long curr_parent = parent.i;
        while(first < n){
            first += curr_parent;
            curr_parent++;
        }

        if(first > n){
            return curr_parent - 1;
        }else{
            return curr_parent;
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
