/* // violation
TodoComment
format = FIXME:


*/

package com.puppycrawl.tools.checkstyle.checks.todocomment;

public class InputTodoCommentFixmeFormat {
    public void brokenMid(int low, int high) {
        int mid = (low + high) / 2; // FIXME: // violation
    }

    /* FIXME: a // violation
     * FIXME:
     * TODO int mid = (low + high) >>> 1;
     */
    /* NOTHING */
    /* YES */ /* FIXME: x */ /* YES!! */ // violation
}
