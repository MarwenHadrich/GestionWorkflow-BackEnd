package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEtape is a Querydsl query type for Etape
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEtape extends EntityPathBase<Etape> {

    private static final long serialVersionUID = 1215236149L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEtape etape = new QEtape("etape");

    public final NumberPath<Integer> idEtape = createNumber("idEtape", Integer.class);

    public final StringPath nomEtape = createString("nomEtape");

    public final NumberPath<Integer> ordre = createNumber("ordre", Integer.class);

    public final StringPath roleEtape = createString("roleEtape");

    public final ListPath<Validation, QValidation> validationList = this.<Validation, QValidation>createList("validationList", Validation.class, QValidation.class, PathInits.DIRECT2);

    protected QWorkflow workflow;

    public QEtape(String variable) {
        this(Etape.class, forVariable(variable), INITS);
    }

    public QEtape(Path<? extends Etape> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEtape(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEtape(PathMetadata metadata, PathInits inits) {
        this(Etape.class, metadata, inits);
    }

    public QEtape(Class<? extends Etape> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.workflow = inits.isInitialized("workflow") ? new QWorkflow(forProperty("workflow")) : null;
    }

    public QWorkflow workflow() {
        if (workflow == null) {
            workflow = new QWorkflow(forProperty("workflow"));
        }
        return workflow;
    }

}

