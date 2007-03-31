package org.python.pydev.refactoring.ast.visitors.context;

import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.ast.ClassDef;
import org.python.pydev.refactoring.ast.adapters.AbstractScopeNode;
import org.python.pydev.refactoring.ast.adapters.ModuleAdapter;

public class LocalAttributeVisitor extends GlobalAttributeVisitor {

	private boolean inLocalScope;

	public LocalAttributeVisitor(ModuleAdapter module, AbstractScopeNode<?> parent) {
		super(module, parent);
		inLocalScope = false;
	}

	@Override
	public void traverse(SimpleNode node) throws Exception {
		if (nodeHelper.isClassDef(node)) {
			ClassDef classDef = (ClassDef) node;
			visit(classDef.body);
		} else
			super.traverse(node);
	}

	@Override
	public Object visitClassDef(ClassDef node) throws Exception {
		if (inLocalScope)
			return null;
		else {
			inLocalScope = true;
			return super.visitClassDef(node);
		}
	}
}