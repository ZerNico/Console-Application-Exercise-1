package MyTestProg;

import MyTestProg.impl.*;

public class CommandFactory {

    public ICommand createGCDSubRecCmd() {
        return new GCDSubRecCmd();
    }

    public ICommand createGCDSubItCmd() {
        return new GCDSubItCmd();
    }

    public ICommand createGCDDivRestRecCmd() {
        return new GCDDivRestRecCmd();
    }

    public ICommand createGCDDivRestItCmd() {
        return new GCDDivRestItCmd();
    }

    public ICommand createPSieveEraCmd() {
        return new PSieveEraCmd();
    }
}
