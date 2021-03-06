// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class Index extends sliceType {
    public exprType value;

    public Index(exprType value) {
        this.value = value;
    }

    public Index(exprType value, SimpleNode parent) {
        this(value);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public Index createCopy() {
        Index temp = new Index(value!=null?(exprType)value.createCopy():null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy());
                }
            }
        }
        if(this.specialsAfter != null){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy());
                }
            }
        }
        return temp;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Index[");
        sb.append("value=");
        sb.append(dumpThis(this.value));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitIndex(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (value != null){
            value.accept(visitor);
        }
    }

}
