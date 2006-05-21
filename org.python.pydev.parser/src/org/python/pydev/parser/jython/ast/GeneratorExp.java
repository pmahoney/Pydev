// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;
import java.io.DataOutputStream;
import java.io.IOException;

public class GeneratorExp extends exprType {
    public exprType elt;
    public comprehensionType[] generators;

    public GeneratorExp(exprType elt, comprehensionType[] generators) {
        this.elt = elt;
        this.generators = generators;
    }

    public GeneratorExp(exprType elt, comprehensionType[] generators,
    SimpleNode parent) {
        this(elt, generators);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("GeneratorExp[");
        sb.append("elt=");
        sb.append(dumpThis(this.elt));
        sb.append(", ");
        sb.append("generators=");
        sb.append(dumpThis(this.generators));
        sb.append("]");
        return sb.toString();
    }

    public void pickle(DataOutputStream ostream) throws IOException {
        pickleThis(36, ostream);
        pickleThis(this.elt, ostream);
        pickleThis(this.generators, ostream);
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitGeneratorExp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (elt != null)
            elt.accept(visitor);
        if (generators != null) {
            for (int i = 0; i < generators.length; i++) {
                if (generators[i] != null)
                    generators[i].accept(visitor);
            }
        }
    }

}