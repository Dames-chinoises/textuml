/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TIs extends Token
{
    public TIs()
    {
        super.setText("is");
    }

    public TIs(int line, int pos)
    {
        super.setText("is");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIs(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIs(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TIs text.");
    }
}