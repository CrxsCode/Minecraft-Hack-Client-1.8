package de.crxscode.client.management;

import de.crxscode.client.module.Module;
import de.crxscode.client.module.modules.Sprint;

import java.util.ArrayList;

public class ModuleManager {

    private ArrayList<Module> modules;

    public ModuleManager() {
        this.modules = new ArrayList<>();

        modules.add(new Sprint());
    }

    public ArrayList<Module> getModules() {
        return modules;
    }
}
