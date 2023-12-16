package operatingsystems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Process {
    int arrivalTime;
    int priority;
    int processTime;
    int memory;
    int printers;
    int scanners;
    int modems;
    int cds;

    public Process(int arrivalTime, int priority, int processTime, int memory, int printers, int scanners, int modems, int cds) {
        this.arrivalTime = arrivalTime;
        this.priority = priority;
        this.processTime = processTime;
        this.memory = memory;
        this.printers = printers;
        this.scanners = scanners;
        this.modems = modems;
        this.cds = cds;
    }
}

