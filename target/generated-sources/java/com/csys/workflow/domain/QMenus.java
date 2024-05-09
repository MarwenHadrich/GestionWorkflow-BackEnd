package com.csys.workflow.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMenus is a Querydsl query type for Menus
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenus extends EntityPathBase<Menus> {

    private static final long serialVersionUID = 1222190114L;

    public static final QMenus menus = new QMenus("menus");

    public final NumberPath<Integer> codMnP = createNumber("codMnP", Integer.class);

    public final StringPath desMenuP = createString("desMenuP");

    public final StringPath desMenuPSec = createString("desMenuPSec");

    public final StringPath logo = createString("logo");

    public final StringPath mnName = createString("mnName");

    public final StringPath module = createString("module");

    public QMenus(String variable) {
        super(Menus.class, forVariable(variable));
    }

    public QMenus(Path<? extends Menus> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMenus(PathMetadata metadata) {
        super(Menus.class, metadata);
    }

}

