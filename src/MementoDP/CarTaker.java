package MementoDP;

import java.util.ArrayDeque;
import java.util.Deque;

public class CarTaker {
    private Deque<Memento> mementos = new ArrayDeque<>();
    private static final int MaxSize = 3; // Max number of mementos to keep

    public void addMemento(Memento memento){
        if(mementos.size()>=MaxSize){
            mementos.removeFirst();
        }
        mementos.addLast(memento);
    }

    public Memento getMemento(int index){
        return mementos.toArray(new Memento[0])[index];
    }
}
