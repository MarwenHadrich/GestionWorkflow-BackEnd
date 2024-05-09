package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTypeEmploye is a Querydsl query type for TypeEmploye
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTypeEmploye extends EntityPathBase<TypeEmploye> {

    private static final long serialVersionUID = -93031765L;

    public static final QTypeEmploye typeEmploye = new QTypeEmploye("typeEmploye");

    public final ListPath<Employe, QEmploye> employeList = this.<Employe, QEmploye>createList("employeList", Employe.class, QEmploye.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idTypeEmploye = createNumber("idTypeEmploye", Integer.class);

    public final StringPath typeemploye = createString("typeemploye");

    public QTypeEmploye(String variable) {
        super(TypeEmploye.class, forVariable(variable));
    }

    public QTypeEmploye(Path<? extends TypeEmploye> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTypeEmploye(PathMetadata metadata) {
        super(TypeEmploye.class, metadata);
    }

}

