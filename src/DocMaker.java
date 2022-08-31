import java.util.*;

public class DocMaker {
    public DocMaker() {
    }

    String shortSummary;
    Dictionary<String, String> parameters;
    String str = "";

    String run () {

//        str += makeOpenBoob();
//
//        str += makeShortSummary(shortSummary);
//
//        str += makeLegalNotes();
//
//        str += makeParameters(parameters);
//
//        str+= makeExample("");
//
//        str += makeCloseBoob();

        return str;
    }

    String makeAttention(String text) {
        return "\n\n" +
                ".. attention::" +
                " " +
                text;
    }

    String makeExample(String content) {
        return "\n\n" +
                "example" +
                "\n" +
                "=======" +
                "\n\n"
                + content;
    }

    String makeCode(String content) {
        content = content.replace("\n", "\n    ");
        return  "\n\n" +
                "code" +
                "\n" +
                "=======" +
                "\n\n" +
                ".. code::" +
                "\n" +
                "   :number-lines: 1" +
                "\n\n    " +
                content;
    }

    String makeParameters(Map<String, String> params) {
        String tmp = "\n\n" +
                "parameters" +
                "\n" +
                "==========" +
                "\n";


        for (Map.Entry<String, String> elem : params.entrySet()) {
            params.entrySet();
            tmp += "\n" +
                    ":" +
                    elem.getKey() +
                    ": " +
                    elem.getValue();
        }


        System.out.println(params.toString());

//        for (int i = listOfParam.size() -1; i > 0; i -= 2) {
//            tmp += "\n" +
//                    ":" +
//                    listOfParam.get(i) +
//                    ": " +
//                    listOfParam.get(i - 1);
//        }
        return tmp +
                "\n";
    }



    String makeLegalNotes() {
        return "\n\n" +
                ".. <legal notes>" +
                "\n\n" +
                "legal notes" +
                "\n" +
                "===========" +
                "\n" +
                "| SPDX-FileCopyrightText: © 2022 ekvip automation GmbH <info@ekvip.de>" +
                "\n" +
                "| SPDX-License-Identifier: Apache-2.0" +
                "\n" +
                "| For details check: Apache-2.0_" +
                "\n\n" +
                ".. _Apache-2.0: https://www.apache.org/licenses/LICENSE-2.0" +
                "\n\n" +
                ".. </legal notes>"+
                "\n";
    }

    String makeShortSummary() {
        return "\n" +
                "short summary" +
                "\n" +
                "=============" +
                "\n";
    }

    String makeShortSummary(String text) {

        text = text.replace("\n", "\n| ");

        return makeShortSummary() +
                "| " +
                text +
                "\n\n";
    }


    String makeOpenBoob () {
        return "\n" +
                "(*" +
                "\n";
    }
    String makeCloseBoob () {
        return "\n" +
                "*)" +
                "\n";
    }
}
