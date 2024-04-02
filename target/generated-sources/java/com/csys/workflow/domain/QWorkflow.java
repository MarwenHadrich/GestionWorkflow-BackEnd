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

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWorkflow workflow = new QWorkflow("workflow");

    public final ListPath<Etape, QEtape> etapeList = this.<Etape, QEtape>createList("etapeList", Etape.class, QEtape.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idWorkflow = createNumber("idWorkflow", Integer.class);

    protected QInterface interface1;

    public final StringPath nomWorkflow = createString("nomWorkflow");

    public QWorkflow(String variable) {
        this(Workflow.class, forVariable(variable), INITS);
    }

    public QWorkflow(Path<? extends Workflow> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWorkflow(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWorkflow(PathMetadata metadata, PathInits inits) {
        this(Workflow.class, metadata, inits);
    }

    public QWorkflow(Class<? extends Workflow> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.interface1 = inits.isInitialized("interface1") ? new QInterface(forProperty("interface1")) : null;
    }

    public QInterface interface1() {
        if (interface1 == null) {
            interface1 = new QInterface(forProperty("interface1"));
        }
        return interface1;
    }

}

