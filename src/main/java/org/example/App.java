package org.example;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        YamlReader yr = new YamlReader();
        yr.getYamlContent();

    }

}
