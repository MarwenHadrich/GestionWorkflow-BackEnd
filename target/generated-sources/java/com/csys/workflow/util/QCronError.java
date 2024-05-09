package com.csys.workflow.util;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCronError is a Querydsl query type for CronError
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCronError extends EntityPathBase<CronError> {

    private static final long serialVersionUID = -578299386L;

    public static final QCronError cronError = new QCronError("cronError");

    public final StringPath cause = createString("cause");

    public final NumberPath<Integer> code = createNumber("code", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> date = createDateTime("date", java.time.LocalDateTime.class);

    public final StringPath msg = createString("msg");

    public QCronError(String variable) {
        super(CronError.class, forVariable(variable));
    }

    public QCronError(Path<? extends CronError> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCronError(PathMetadata metadata) {
        super(CronError.class, metadata);
    }

}

