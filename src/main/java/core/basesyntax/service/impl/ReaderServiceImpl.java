package core.basesyntax.service.impl;

import core.basesyntax.service.ReaderService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    public List<String> readFromFile(String fileName) {
        File file = new File(fileName);
        try {
            return Files.readAllLines(file.toPath());
        } catch (IOException e) {
            throw new RuntimeException("Can't read file",e);
        }
    }
}