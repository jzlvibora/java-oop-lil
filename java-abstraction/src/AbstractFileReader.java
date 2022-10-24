import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractFileReader {
    private final Path filePath;

    protected AbstractFileReader(String filePath){
        this.filePath=Path.of(filePath);
    }

    public String getPath(){
        return filePath.toString();
    }

    public List<String> readFile() throws IOException{
        List list = Files.lines(filePath)
                .map(this::parseLine)
                .collect(Collectors.toList());

        return list;
    }


    //we used abstract to force to other class in implementing this method
    protected abstract String parseLine(String line);
}
