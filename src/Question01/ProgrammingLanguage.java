/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

/**
 *
 * @author Amulya Mallepalli
 */
public class ProgrammingLanguage implements Language, Usage {

    private String langName;
    private boolean isEasy;
    private String usage;

    public ProgrammingLanguage(String langName, boolean isEasy, String usage) {
        this.langName = langName;
        this.isEasy = isEasy;
        this.usage = usage;
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
    public String usage() {
        return this.usage;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage: " + "langName=" + langName + ", isEasy="
                + isEasy + ", usage=" + usage;
    }

}
