package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkflow is a Querydsl query type for Workflow
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkflow extends EntityPathBase<Workflow> {

    private static final long serialVersionUID = -1828711471L;

    public static final QWorkflow workflow = new QWorkflow("workflow");

    public final ListPath<Etape, QEtape> etapeList = this.<Etape, QEtape>createList("etapeList", Etape.class, QEtape.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idWorkflow = createNumber("idWorkflow", Integer.class);

    public final ListPath<Interface, QInterface> interfaces = this.<Interface, QInterface>createList("interfaces", Interface.class, QInterface.class, PathInits.DIRECT2);

    public final StringPath nomWorkflow = createString("nomWorkflow");

    public QWorkflow(String variable) {
        super(Workflow.class, forVariable(variable));
    }

    public QWorkflow(Path<? extends Workflow> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorkflow(PathMetadata metadata) {
        super(Workflow.class, metadata);
    }

}

