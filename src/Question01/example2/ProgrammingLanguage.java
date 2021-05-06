/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01.example2;

import Question01.*;

/**
 *
 * @author Amulya Mallepalli
 */
public class ProgrammingLanguage extends Language {

    private String langName;
    private boolean isEasy;

    public ProgrammingLanguage(String langName, boolean isEasy) {
        this.langName = langName;
        this.isEasy = isEasy;
    }

    @Override
    public String getName() {
        return this.langName;
    }

    @Override
    public boolean isEasyToLearn() {
        return this.isEasy;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage: " + "langName=" + langName + ", isEasy="
                + isEasy;
    }

}
