/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TAll extends Token
{
    public TAll()
    {
        super.setText("all");
    }

    public TAll(int line, int pos)
    {
        super.setText("all");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAll(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAll(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAll text.");
    }
}