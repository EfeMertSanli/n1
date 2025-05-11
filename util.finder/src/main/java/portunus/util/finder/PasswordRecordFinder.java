package portunus.util.finder;

import java.util.ArrayList;
import java.util.List;

import portunus.core.IEntry;
import portunus.core.IPasswordLibrary;
import portunus.core.IPasswordRecord;
import portunus.core.util.finder.IPasswordRecordFinder;

/**
 * This class implements a password record finder for Portunus.
 */
public class PasswordRecordFinder implements IPasswordRecordFinder {

    @Override
    public List<IPasswordRecord> findMatchingPasswordRecords(String partialString, IPasswordLibrary passwordLibrary) {
        List<IPasswordRecord> matchingPasswordRecords = new ArrayList<>();

        // TODO

        return matchingPasswordRecords;
    }

}
