/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TPrimitive extends Token
{
    public TPrimitive()
    {
        super.setText("primitive");
    }

    public TPrimitive(int line, int pos)
    {
        super.setText("primitive");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPrimitive(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPrimitive(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPrimitive text.");
    }
}
