package portunus.launcher;

import portunus.launcher.base.AbstractPortunusFactory;
import portunus.core.IPasswordGroup;
import portunus.core.IPasswordLibrary;
import portunus.core.IPasswordRecord;
import portunus.core.util.finder.IPasswordRecordFinder;
import portunus.core.util.io.IPasswordLibraryLoader;
import portunus.core.util.io.IPasswordLibrarySaver;
import portunus.core.util.passwordgenerator.IPasswordGenerator;

/**
 * A factory that provides instances of implementations of the portunus interfaces.
 */
public class PortunusFactory extends AbstractPortunusFactory {

    @Override
    public IPasswordLibrary createPasswordLibrary() {
        // TODO
        return null;
    }

    @Override
    public IPasswordGroup createPasswordGroup() {
        // TODO
        return null;
    }

    @Override
    public IPasswordRecord createPasswordRecord() {
        // TODO
        return null;
    }

    @Override
    public IPasswordLibraryLoader createPasswordLibraryLoader() {
        // TODO
        return null;
    }

    @Override
    public IPasswordLibrarySaver createPasswordLibrarySaver() {
        // TODO
        return null;
    }


    @Override
    public IPasswordGenerator createPasswordGenerator() {
        // TODO
        return null;
    }


    @Override
    public IPasswordRecordFinder createPasswordRecordFinder() {
        // TODO
        return null;
    }

}
