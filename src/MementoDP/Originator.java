package MementoDP;

public class Originator {
    private String state;

    private void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
