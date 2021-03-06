// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class Global extends stmtType {
    public NameTokType[] names;
    public exprType value;

    public Global(NameTokType[] names, exprType value) {
        this.names = names;
        this.value = value;
    }

    public Global(NameTokType[] names, exprType value, SimpleNode parent) {
        this(names, value);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public Global createCopy() {
        NameTokType[] new0;
        if(this.names != null){
        new0 = new NameTokType[this.names.length];
        for(int i=0;i<this.names.length;i++){
            new0[i] = (NameTokType) (this.names[i] != null? this.names[i].createCopy():null);
        }
        }else{
            new0 = this.names;
        }
        Global temp = new Global(new0, value!=null?(exprType)value.createCopy():null);
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
        StringBuffer sb = new StringBuffer("Global[");
        sb.append("names=");
        sb.append(dumpThis(this.names));
        sb.append(", ");
        sb.append("value=");
        sb.append(dumpThis(this.value));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitGlobal(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (names != null) {
            for (int i = 0; i < names.length; i++) {
                if (names[i] != null){
                    names[i].accept(visitor);
                }
            }
        }
        if (value != null){
            value.accept(visitor);
        }
    }

}
