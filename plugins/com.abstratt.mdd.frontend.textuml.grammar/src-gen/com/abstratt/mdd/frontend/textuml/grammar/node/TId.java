/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TId extends Token
{
    public TId()
    {
        super.setText("id");
    }

    public TId(int line, int pos)
    {
        super.setText("id");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TId(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTId(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TId text.");
    }
}
