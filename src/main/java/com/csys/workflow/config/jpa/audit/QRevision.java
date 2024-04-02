package com.csys.workflow.config.jpa.audit;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;

import com.querydsl.core.types.Path;

import javax.annotation.Generated;


/**
 * QRevision is a Querydsl query type for Revision
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRevision extends EntityPathBase<Revision> {

    private static final long serialVersionUID = -1179276971L;

    public static final QRevision revision = new QRevision("revision");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.util.Date> timestamp = createDateTime("timestamp", java.util.Date.class);

    public final StringPath userCreate = createString("userCreate");

    public QRevision(String variable) {
        super(Revision.class, forVariable(variable));
    }

    public QRevision(Path<? extends Revision> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRevision(PathMetadata metadata) {
        super(Revision.class, metadata);
    }

}

