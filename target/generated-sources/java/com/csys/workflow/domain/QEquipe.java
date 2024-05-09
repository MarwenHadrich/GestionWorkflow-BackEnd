package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEquipe is a Querydsl query type for Equipe
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEquipe extends EntityPathBase<Equipe> {

    private static final long serialVersionUID = -984566073L;

    public static final QEquipe equipe = new QEquipe("equipe");

    public final NumberPath<Integer> idEquipe = createNumber("idEquipe", Integer.class);

    public final StringPath nomEquipe = createString("nomEquipe");

    public final ListPath<RoleEquipe, QRoleEquipe> roleEquipeList = this.<RoleEquipe, QRoleEquipe>createList("roleEquipeList", RoleEquipe.class, QRoleEquipe.class, PathInits.DIRECT2);

    public QEquipe(String variable) {
        super(Equipe.class, forVariable(variable));
    }

    public QEquipe(Path<? extends Equipe> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEquipe(PathMetadata metadata) {
        super(Equipe.class, metadata);
    }

}

