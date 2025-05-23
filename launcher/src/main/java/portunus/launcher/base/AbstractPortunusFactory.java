package portunus.launcher.base;

import portunus.core.IPasswordGroup;
import portunus.core.IPasswordRecord;
import portunus.core.IPortunusFactory;

/**
 * An abstract class for constructing portunus model elements.
 */
public abstract class AbstractPortunusFactory implements IPortunusFactory {
    @Override
    public IPasswordGroup createPasswordGroup(String title) {
        IPasswordGroup passwordGroup = createPasswordGroup();

        if (passwordGroup != null) {
            passwordGroup.setTitle(title);
        }

        return passwordGroup;
    }

    @Override
    public IPasswordRecord createPasswordRecord(String title) {
        IPasswordRecord passwordRecord = createPasswordRecord();

        if (passwordRecord != null) {
            passwordRecord.setTitle(title);
        }

        return passwordRecord;
    }
}
