import portunus.core.IPortunusFactory;
import portunus.launcher.PortunusFactory;

/**
 * Packages all modules together to create a runnable program. Launches the Portunus GUI.
 */
module portunus.launcher {
    requires portunus.controller;
    requires portunus.util.passwordgenerator;
    requires portunus.view;

    exports portunus.launcher;

    provides IPortunusFactory with PortunusFactory;
}
