public class TableMaker {

    StringBuilder sb = new StringBuilder();
    String leftAlignFormat = "";

    String createTableFormat(String fmt, String divider, String ...args) {
        String tmp = "";
        tmp += String.format(fmt, args);
        return tmp;
    }


}
