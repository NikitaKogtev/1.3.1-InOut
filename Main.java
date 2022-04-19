import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();

        File dir = new File("C://Game/src");
        if (dir.mkdir()) {
            stringBuilder.append("Каталог ").append(dir.getName()).append(" создан");
            stringBuilder.append("\n");
        }

        File dir1 = new File("C://Game/res");
        if (dir1.mkdir()) {
            stringBuilder.append("Каталог ").append(dir1.getName()).append(" создан");
            stringBuilder.append("\n");
        }

        File dir2 = new File("C://Game/savegames");
        if (dir2.mkdir()) {
            stringBuilder.append("Каталог ").append(dir2.getName()).append(" создан");
            stringBuilder.append("\n");
        }

        File dir3 = new File("C://Game/temp");
        if (dir3.mkdir()) {
            stringBuilder.append("Каталог ").append(dir3.getName()).append(" создан");
            stringBuilder.append("\n");
        }

        File dir4 = new File("C://Game/src/main");
        if (dir4.mkdir()) {
            stringBuilder.append("Каталог ").append(dir4.getName()).append(" создан");
            stringBuilder.append("\n");
        }

        File dir5 = new File("C://Game/src/test");
        if (dir5.mkdir()) {
            stringBuilder.append("Каталог ").append(dir5.getName()).append(" создан");
            stringBuilder.append("\n");
        }

        File file = new File("C://Game/src/main/Main.java");
        try {
            if (file.createNewFile()) {
                stringBuilder.append("В каталоге ").append(file.getParent()).append(" был создан файл ").append(file.getName());
                stringBuilder.append("\n");
            }
        } catch (IOException exception) {
            exception.getMessage();
        }

        File file1 = new File("C://Game/src/main/Utils.java");
        try {
            if (file1.createNewFile()) {
                stringBuilder.append("В каталоге ").append(file1.getParent()).append(" был создан файл ").append(file1.getName());
                stringBuilder.append("\n");
            }
        } catch (IOException exception) {
            exception.getMessage();
        }

        File dir6 = new File("C://Game/res/drawables");
        if (dir6.mkdir()) {
            stringBuilder.append("Каталог ").append(dir6.getName()).append(" создан");
            stringBuilder.append("\n");
        }

        File dir7 = new File("C://Game/res/vectors");
        if (dir7.mkdir()) {
            stringBuilder.append("Каталог ").append(dir7.getName()).append(" создан");
            stringBuilder.append("\n");
        }

        File dir8 = new File("C://Game/res/icons");
        if (dir8.mkdir()) {
            stringBuilder.append("Каталог ").append(dir8.getName()).append(" создан");
            stringBuilder.append("\n");
        }

        File file2 = new File("C://Game/temp/temp.txt");
        try {
            if (file2.createNewFile()) {
                stringBuilder.append("В каталоге ").append(file2.getParent()).append(" был создан файл ").append(file2.getName());
                stringBuilder.append("\n");
            }
        } catch (IOException exception) {
            exception.getMessage();
        }

        try (FileWriter writer = new FileWriter("C://Game/temp/temp.txt")) {
            writer.write(String.valueOf(stringBuilder));
            writer.flush();
        } catch (IOException exception) {
            exception.getMessage();
        }

        System.out.println(stringBuilder);

    }
}
